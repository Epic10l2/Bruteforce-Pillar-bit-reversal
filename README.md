# Bruteforce-Pillarseed-bit-reversal
Bruteforces possible lower 32 bits of a seed using the pillar seed.

To input a Pillar seed you will have to open the Bruteforcer.java and find line 9:
if (pillarseed == ) {
                 |
                Pillarseed
                
As shown above you just input your pillarseed there.

To run the programm easely i recommend installing intellij idea community edition opening the project there.

You will need to make a custom run configuration cuz i smh messed it up.

For that just right click the resources folder -> copy path -> absolute path.

Now got to the 3 dots and click edit run configurations. 

Add a new configuration using the + and select Application. 

Name it whatever you want, select your java version and right next to it you will need to input the main class. 

Just input Bruteforecer.java. Below that you will have to input a working directory. 

You will now need to paste the path your copied earlier into there.
![image](https://github.com/Epic10l2/Bruteforce-Pillarseed-bit-reverseal/assets/159151274/bb684414-43f3-4d7a-80f3-3c6886065c72)

Now change the run configuration right next to the start button to the newly added run configuration.

Press the start button and wait.

At the bottom a window will open up and it will output all the results(takes about 2 minutes or so and outputs exactly 65536 possible lower 32 bits of a seed).

I recommend using ctrl + a and then ctrl+c to copy everything and then remove the first and last line which are not supposed to be an output.
