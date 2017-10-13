package javausage;

import package1.OtherTypeInPackage1;
import package1.SampleType;
import package1.TypeInPackage1;
import package2.OtherTypeInPackage2;
import package2.TypeInPackage2;

public class JavaUser {

	TypeInPackage1 v1;
	OtherTypeInPackage1 v2;
	TypeInPackage2 v3;
	OtherTypeInPackage2 v4;

	public static void main(String[] args) {
		new SampleType().methodInPackage1();
	}
}
