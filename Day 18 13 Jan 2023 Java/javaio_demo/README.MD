### java.io.*

The legacy API (classes in the java.io.* package) is perfect for manipulating low-level binary I/O operations such as reading and writing exactly one byte at a time.

### java.nio.*

The NIO API (classes in the java.nio.* package) is more convenient for reading and writing the whole file at once, and of course, faster than the old File I/O API.


```

Input     			--- Read Operation
Output    			--- Write Operation

Stream    			--- Byte level access to file

Reader    			--- Character level access to file
Writer    			--- Character level access to file

StreamReader 		--- Convert Byte to Char and read to file
StreamWriter 		--- Convert Byte to Char and write to file

Buffered 			--- Faster access to file (chunk of data used at a time)

BufferedxxxxStream 	--- internal buffer of 8192 bytes (8KB) to store mote bytes and do work faster
BufferedReader  	--- Line by Line access to character in file
BufferedWriter  	--- Line by Line access to character in file

Note: Writer(s) use the default character encoding of the operating system. e.g. UTF-16, UTF-8

```


> https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
