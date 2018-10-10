package com.cg.project.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.project.bean.Address;
import com.cg.project.bean.Associate;

public class SerializationDemo {

	public static void doSerialization(File file) throws FileNotFoundException,
			IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(
				new FileOutputStream(file))) {
			Associate associate = new Associate(101, 50000, "Sahil",
					new Address("Pune", "Maharashtra"));
			writer.writeObject(associate);
			System.out.println("Object Transferred to file " + file);
		}
	}

	public static void doDeSerialization(File file)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream reader = new ObjectInputStream(
				new FileInputStream(file))) {
			Associate associate = (Associate) reader.readObject();
			System.out.println(associate);
		}
	}
}
