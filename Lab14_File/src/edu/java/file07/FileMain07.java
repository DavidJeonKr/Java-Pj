package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.file06.Product;

public class FileMain07 {

	public static void main(String[] args) {
		// 1. ArrayList<Product> 생성해서 파일에 write
		try (FileOutputStream out = new FileOutputStream("data/product_list.dat");
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) { // try-with-resourse
			// 파일에 저장할 ArrayList<Product>를 생성
			// ArrayList에 Product 객체를 1,000개를 저장
			List<Product> list = new ArrayList<Product>();
			for (int i = 0; i < 1000000; i++) {
//				list.add(new Product(i+1, "Product_" + (i+1), 1000));
				Product p = new Product(i + 1, "Product_" + (i + 1), 1000);
				list.add(p);
			}

			// ArrayList를 파일에 write
			long start = System.currentTimeMillis();
			oos.writeObject(list);
			long end = System.currentTimeMillis();
			System.out.println("쓰기 경과 시간: " + (end - start) + "ms");
			// 9690ms object
			// 1447ms buffer
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. 파일에서 ArrayList<Product> 객체를 읽어서 read
		try(FileInputStream in = new FileInputStream("data/product_list.dat");
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {
			long start = System.currentTimeMillis();
			Object obj = ois.readObject();
			long end = System.currentTimeMillis();
			System.out.println("읽기 경과 시간: " + (end - start) + "ms");
			// 파일에서 읽은 ArrayList의 첫번째 원소, 마지막 원소 출력
			if( obj instanceof ArrayList<?>) {
				List<Product> list = (List<Product>) obj; 
				System.out.println(list.get(0));
				System.out.println(list.get(list.size()-1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
