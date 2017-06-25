package application;

import java.util.HashMap;
import java.util.Map;

public class L1Translator {
	private Memory memory;
	private Map<String, MethodObject> methodMap = new HashMap<String, MethodObject>();

	L1Translator() {
		memory = new Memory("src\\resource\\memory\\L1 Translator Memory.txt");
	}

	public Memory getMemory() {
		return memory;
	}
	private void makeMap(){
		methodMap.put("add rectangle", new MethodObject(){
			public void voidMethod(){System.out.println("rectange added");}
			public String stringMethod() {
				return null;
			}
		});
	}

}
