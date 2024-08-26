package common

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(
        value = [
            RuntimeException::class,
        ]
    )
    fun handleUnEstimatedRuntimeException(ex: Exception): ResponseEntity<Any?>? {
        return ResponseEntity<Any?>(
            "An error occurred: ${ex.message}",
            HttpStatus.INTERNAL_SERVER_ERROR
        )
    }
}