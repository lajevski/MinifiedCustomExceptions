package deep.sand.r8_custom_exceptions

internal class Exception3(
    message: String? = null,
    cause: Throwable? = null
) : IllegalStateException(
    "Exception3: $message",
    cause,
)
