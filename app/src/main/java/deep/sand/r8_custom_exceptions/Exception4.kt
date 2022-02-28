package deep.sand.r8_custom_exceptions

internal class Exception4(
    message: String? = null,
    cause: Throwable? = null
) : IllegalStateException(
    "Exception4: $message",
    cause,
)
