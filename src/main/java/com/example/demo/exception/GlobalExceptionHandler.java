// package com.example.demo.exception;
// import org.springframework.web.bind.annotation.RestControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;

// import java.util.Map;
// import 

// @RestControllerAdvice
// public class GlobalExceptionHandler{

//     @ExceptionHandler(ResourceNotFoundException.class){
//         public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){
//             return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
//         }
//     }

//     @ExceptionHnadler(MethodArgumentNotFoundValidException.class)
//     public ResponseEntity<Map<String, String>> handleMethod(MethodArgumentNotFoundValidException){
//         Map<String, String> error=new HashMap<>();

        

//     }
// }