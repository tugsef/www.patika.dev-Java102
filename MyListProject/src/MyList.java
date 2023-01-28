

public class MyList<T> {
	
	
	private Object[] arrays = {};
	private int capacity ;
	private int size = 0;
	
	public MyList() {
		this.capacity = 10;
		this.arrays = new Object[capacity];
	}
	

	public MyList(int capacity) {
		
		this.capacity = capacity;
		this.arrays = new Object[capacity];
		
	}
	
//	public void size() {
//		
//		for (Object object : this.arrays) {
//			if(object != null ) {
//				count++;
//			} else {
//				System.out.println("Diziniz Boş...");
//				break;
//			}
//		}
//		
//	
//	}
	
    //int lastIndexOf nt lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
	
	public int lastIndexOf(T data) {
		
		if(isEmpty()) {
			for(int i=(size-1) ; i >=0 ; i--) {
				
				if(arrays[i].equals(data)) {
					
					return i;
				} 
				
				
			}
		 return -1;
		}else {
			System.out.println("Liste boş");
			return -1;
		}
	
	}
	
	// int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
	
	
	public int indexOf(T data) {
		if(isEmpty()) {
			for(int i=0 ; i <this.size ; i++) {
				if(arrays[i].equals(data)) {
					return i;
				} 
			}
		  return -1;
		}else {
			System.out.println("Liste boş");
			return -1;
		}
	
	}
	
	
	
	
	// Eleman ekleme
	
	public void add(T data) {
		
		this.arrays[size] = data;
		
		this.size = this.size + 1;
		
		if(size  == this.arrays.length) {
			this.capacity = this.capacity*2;
			Object[] copyArry = new Object[this.capacity];
			
			for (int i=0; i<size ; i++) {
				copyArry[i] = this.arrays[i];
			}
			
			this.arrays = copyArry;
			
		}
	}

	// İstenen indeksli elemanı getrir
	
	public Object get(int index) {
		if(isEmpty()) {
		
			if(index > (size-1)) {
				return null;
			}else {
				return this.arrays[index];
			 
			}
		} else {
			return null;
		}
	}
	
	// dizi boş mu değil mi
	
	public  boolean isEmpty() {
	
		for (Object object: this.arrays) {
			if(object != null) 
				return true;
			
		}
		return false;
	}
	
	
	//Eleman sayısı
	public void size() {
		
			if(isEmpty()) {
		System.out.println("Eleman Sayısı : " + this.size);
			} else {
				System.out.println("Dizide eleman yok....");
			}
	}
	
	// eleman silme diziyi sola doğru yazdırma
	
	public void remove(int index) {
		Object[] copyMyList = new Object[this.capacity];
		if(isEmpty()) {
			if(index >=size) {
				System.out.println("Hatalı Sayı Girdiniz...");
			}else {
			System.out.println("Başarı ile silindi..." + this.arrays[index]); 
			this.size = this.size - 1;
			for(int i = 0 ; i <size ;i++) {
				
				if(i>=index) {
					copyMyList[i] = this.arrays[i+1];
				}else {
					copyMyList[i] = this.arrays[i];
				}
				
				
			}
			this.arrays = copyMyList;
			}
		} else {
			System.out.println("null");
		}
	}
	
	
	public void set(int index , T data) {
		if(isEmpty()) {
			if(index > (size-1)) {
				System.out.println("null");
			}else {
				System.out.println(this.arrays[index] + " elemanı " + data + " elemanı ile değiştirildi.");
				this.arrays[index] = data;
			}
			
			
		} else {
			System.out.println("null");
		}
		
		
	}
	
	
	public int getSize() {
		return size;
	}


	// Diziyi ekrana bastırmak
	
	public String toString() {
		for (Object object : arrays) {
			if (object != null){
			System.out.println(object);}
		}
		return super.toString();
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Object[] getArrays() {
		return arrays;
	}
	public void setArrays(T[] arrays) {
		this.arrays = arrays;
	}
	
	// Dizinin Kapasitesi
	
	public int getCapacity() {
		
		return this.capacity ;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		
	}
	
	//dizi içerisinde var mı 
	
	public boolean constains(T data) {
	 if(isEmpty()) {
		 for (Object object : arrays) {
			if(object.equals(data)) {
				return true;
			}
		}
	 }
	
	return false;
	}
	// listeyi sil
	
	public void clear() {
		for (int i = 0 ; i<size;i++ ) {
			this.arrays[i] = null;
		}
		this.capacity =10;
		this.size = 0;
	}
	
	// array haline getirme
	
	public Object[] toArray() {
		Object[] arrayto = new Object[this.capacity];
		arrayto = arrays;
		
		return arrayto;
	}
	
	
	// İstenilen aralık ta verileri döner
	
 public MyList<Object> subList(int start , int finish){
	
	
	 if(isEmpty()) {
		 if(finish<start) {
			 System.out.println("Başlangıç Değeriniz Bitiş Değerinizden Büyük olamaz... ");
			 return null;
		 } else {
			MyList<Object> mylist = new MyList<Object>(this.capacity);
			
			 for (int i = start; i < finish; i++) {
				mylist.add(this.arrays[i]);
				 
				 
				
			}
			 return mylist;
		 }
				
	 } else {
		 return null;
	 }
 }
	
	
}
