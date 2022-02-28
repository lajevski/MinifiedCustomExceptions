package deep.sand.r8_custom_exceptions

internal class Exception2(
    message: String? = null,
    cause: Throwable? = null
) : IllegalStateException(
    "Exception2: $message",
    cause,
)
