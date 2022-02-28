Example project intended for `:app:minifyReleaseWithR8` behaviour with custom exceptions. <br>

`mapping.txt`<br>
![Screenshot 2022-02-28 at 12 06 38](https://user-images.githubusercontent.com/31980284/155964486-126f90a5-d5c7-4ba1-8a6b-20bdfa1e4011.png)

During deobfuscation [Exception3](https://github.com/lajevski/MinifiedCustomExceptions/blob/main/app/src/main/java/deep/sand/r8_custom_exceptions/Exception3.kt) would be treated as [Exception1](https://github.com/lajevski/MinifiedCustomExceptions/blob/main/app/src/main/java/deep/sand/r8_custom_exceptions/Exception1.kt) and [Exception4](https://github.com/lajevski/MinifiedCustomExceptions/blob/main/app/src/main/java/deep/sand/r8_custom_exceptions/Exception4.kt) as [Exception2](https://github.com/lajevski/MinifiedCustomExceptions/blob/main/app/src/main/java/deep/sand/r8_custom_exceptions/Exception2.kt). 

---
Bug or feature?
