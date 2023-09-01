package lib

import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {
    @Test
    fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertEquals(
            "Some billionaires are very fine people.",
            classUnderTest.truth(),
            "truth should be that billionaires are very fine people"
        )
    }
}
