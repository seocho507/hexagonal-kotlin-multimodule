package annotations

import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Component
annotation class PersistentAdapter()
