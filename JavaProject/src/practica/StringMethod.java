package practica;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = new String(); //пустая строка 
		String str3 = new String(new char[] {'d','f','g'});
		String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов
		System.out.println(str1); // Java
		System.out.println(str2); //
	    System.out.println(str3); // hello
	    System.out.println(str4); // come
	    
	    
	    String str = "java";
	    System.out.println(str.length()); //4
	    
	    
	    
	    //А с помощью метода toCharArray() можно обратно преобразовать строку в массив символов:
	    
	    String world  = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
	    char[] hello = world.toCharArray();
	    System.out.println(hello);
	    System.out.println(world);
	    
	    
	    //Класс String имеет специальный метод, который позволяет проверить строку на пустоту - isEmpty(). Если строка пуста, он возвращает true:
	    String s = "";
	    if(s.length() == 0) {
	    	System.out.println("String is emty");
	    }
	    
	    String ss = "";
	    if(s.isEmpty()) {
	    	System.out.println("String is emty");
	    }
	    
	    
	    //Переменная String может не указывать на какой-либо объект и иметь значение null:
	    
	    String q = null;   // строка не указывает на объект
	    if(q == null) {
	    	System.out.println("String is null");
	    }
	    
	    
	    //CONCAT
	    
	    String sen = "У меня ";
	    sen = sen.concat("друг");
	    System.out.println(sen);
	    
	    
	    
	    String name = "BR    ";
	    //boolean res  = name.equals("BRO");
	    //char  r = name.charAt(0);
	    //int r = name.indexOf("B");
//	    String r = name.toUpperCase();
//	    String r = name.toLowerCase();
//	    String r = name.trim(); //remove is empty space
	    String r = name.replace('R', 't');
	    System.out.println(r);
	}

}
