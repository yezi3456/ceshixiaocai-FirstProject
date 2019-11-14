package movie;

import java.io.IOException;

import com.webtest.dataprovider.TxtDataProvider;

public class aaas {

	public static void main(String[] args) {
		Object [][] result = new Object[2][2];
		// TODO Auto-generated method stub
		TxtDataProvider sc=new TxtDataProvider();
		try {
			result=sc.getTxtUser("E:\\demo.txt");
			System.out.println(result[0][1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
