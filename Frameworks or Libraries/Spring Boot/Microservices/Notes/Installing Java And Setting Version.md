https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb

```java
sudo apt install ./jdk-21_linux-x64_bin.deb
```

choose a version - sudo update-alternatives --config java

```java
anurag@anurag-IdeaPad-Gaming-3-15ACH6:~/Downloads$ sudo update-alternatives --config java
There are 4 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                         Priority   Status
------------------------------------------------------------
  0            /usr/lib/jvm/jdk-22.0.2-oracle-x64/bin/java   369115136 auto mode
* 1            /usr/lib/jvm/java-17-openjdk-amd64/bin/java   1         manual mode
  2            /usr/lib/jvm/java-21-openjdk-amd64/bin/java   2111      manual mode
  3            /usr/lib/jvm/jdk-21.0.9-oracle-x64/bin/java   352395264 manual mode
  4            /usr/lib/jvm/jdk-22.0.2-oracle-x64/bin/java   369115136 manual mode

Press <enter> to keep the current choice[*], or type selection number: 

```