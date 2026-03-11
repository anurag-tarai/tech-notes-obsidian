Comparator is an interface used to **define custom sorting logic for objects**.

It is part of the **Java Collections Framework** and is used when we want to sort objects **based on different criteria**.

It is also a **Functional Interface**, so it can be implemented using **Lambda Expressions** (Java 8+).

---
A **Comparator** compares two objects and determines their order.

It contains one abstract method:

int compare(T o1, T o2);

Return value meaning:

|Return|Meaning|
|---|---|
|negative|o1 < o2|
|zero|o1 == o2|
|positive|o1 > o2|

---