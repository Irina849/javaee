package model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ActorModel extends ArrayList<Actor> {

	private static ActorModel instance;
	private ArrayList<Actor> act = new ArrayList<Actor>();
			
			
	private ActorModel() {

	}
	
	
	public ArrayList<Actor> getAct() {
		return act;
	}

	public void setAct(ArrayList<Actor> act) {
		this.act = act;
	}

	public static ActorModel getInstance() {

		if (instance == null) {
			instance = new ActorModel();
		 try {
             readXml("C:\\Users\\Ira\\Desktop\\MOE\\3course\\Java EE\\lab2\\WebContent\\file.xml");
         } catch (FileNotFoundException e) {
             System.out.println("File not found!");
             
           
         }
		}
		return instance;
	}

	public static void writeXml(String fileName) throws FileNotFoundException {
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
		encoder.writeObject(instance.getAct());
		encoder.close();
	}

	public static void readXml(String fileName) throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
        instance.setAct((ArrayList<Actor>) decoder.readObject());
        decoder.close();
    }
	


	public static void main(String[] args) {

		ActorModel model = new ActorModel();
		for (Actor actor : ActorModel.getInstance()) {
			System.out.println(actor);
		}

	}

}
