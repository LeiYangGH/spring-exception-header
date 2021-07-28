# spring-exception-header
a demo project to reproduce the problem of springboot get header when @ExceptionHandler occurs.

# curl

```bash
curl -H "id:123" -H "Content-Type: application/json" http://localhost:8080 --data '{"Title":""}' 
```
