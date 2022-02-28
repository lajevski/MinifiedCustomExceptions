package deep.sand.r8_custom_exceptions

internal class Exception1(
    message: String? = null,
    cause: Throwable? = null
) : IllegalStateException(
    "Exception1: $message",
    cause,
)
