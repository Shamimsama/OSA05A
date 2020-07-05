package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListPractice {
	//List specific method
//	boolean add(Object o);
//	boolean addAll(Collection c);
//	boolean remove(Object o);
//	Object get(Index i);
//	void set(int index, Object newObject);
//	int indexOf(Object o);
//	ListIterator listIterator();
	
	//1. duplicate value allowed
	//2. insertion order preserved
	
	//List implemented by ---------> 1. ArrayList, 2. LinkList, 3. Vector, 4. 
	
	
	public ArrayList<String> getData(List<WebElement> elements)
	{
		ArrayList <String> acV=new ArrayList();
		for(WebElement element:elements)
		{
			String value=element.getText();
			acV.add(value);
		}
		return acV;
	}
	
	public ArrayList<String> getExV(String[] exValue)
	{
		ArrayList <String> exV=new ArrayList();
		for(String x:exValue)
		{
			exV.add(x);
		}
		return exV;
		
	}

	public void compare(ArrayList<String> e,ArrayList<String> a) {
		Iterator i=e.iterator();
		Iterator i1=a.iterator();
		while(i.hasNext()&&i1.hasNext())
		{
			//Assert.assertTrue(i.next().equals(i1.next()));
			
			if(i.next().equals(i1.next()))
			{
				System.out.println("matched");
			}else
				System.out.println("not matched");
		}
		
	}
	
	
	
	
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Downloads\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.eshopper24.com");
		dr.findElement(By.xpath("html/body/div[9]/div[4]/div/div[1]/span")).click();;
		List<WebElement> eles=dr.findElements(By.xpath("html/body/div[9]/div[1]/div[2]/div/div[2]/div/ul/li/a"));
		ArrayList<String> x=getData(eles);
		String[] v= {"Cotton Saree","fhf","jgjg","jgjg"};

		 ArrayList<String> x1=getExV(v);
		 compare(x,x1);
		
		
	}

	
	
	
	
	
	
	
	
	


}
