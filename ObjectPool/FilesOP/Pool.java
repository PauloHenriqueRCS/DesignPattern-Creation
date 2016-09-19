package FilesOP;

public interface Pool < T > {
	
	 T acquire () ;
	 void release ( T t ) ;


}
