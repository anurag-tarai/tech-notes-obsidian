> An optional dependency is a dependency that a class **can work without**. If it is not provided, the application should still run normally. 
> 
> Setter injection is commonly used for optional dependencies because the dependency can be injected later or skipped.

```java
class PaymentService {

    private DiscountService discountService; // optional

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }
}
```
👉 If `DiscountService` is not injected, `PaymentService` can still work.