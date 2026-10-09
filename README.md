# quadratic-lib

Thư viện Java giải phương trình bậc 2 (ax² + bx + c = 0).

## Cấu trúc

```
quadratic-lib/
├── pom.xml
├── src/main/java/com/codegym/QuadraticEquation.java
└── target/quadratic-lib-1.0-SNAPSHOT.jar   (sau khi build)
```

## Cách đóng gói

```bash
mvn clean package
```

File JAR sẽ nằm ở: `target/quadratic-lib-1.0-SNAPSHOT.jar`

## Sử dụng

```java
QuadraticEquation eq = new QuadraticEquation(1, -3, 2);
System.out.println(eq.solve());
// Phương trình có 2 nghiệm phân biệt:
//   x1 = 2.0
//   x2 = 1.0
```

## Các phương thức chính

| Phương thức          | Mô tả                          |
|----------------------|--------------------------------|
| `getDiscriminant()`  | Tính delta = b² - 4ac          |
| `getRoot1()`         | Nghiệm x1                      |
| `getRoot2()`         | Nghiệm x2                      |
| `solve()`            | Trả về chuỗi mô tả kết quả     |
