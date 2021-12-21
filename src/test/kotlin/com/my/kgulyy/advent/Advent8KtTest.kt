package com.my.kgulyy.advent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Advent8KtTest {

    @Test
    fun smokeTest() {
        assertThat(advent8("/advent_8/smoke.test")).isEqualTo("BE")
    }

    @Test
    fun mainTest() {
        assertThat(advent8("/advent_8/main.test"))
            .isEqualTo(
                "GTQJTGJUADAPJQATPNXPXTMWHPGAWGUPJLWMUGBEJAWMGDTMDPGDPATPHADJGWJAWQDKEFPATDPNWPATAWPHP" +
                        "ALGJPGPJPMJGTPNPXJACQADTPTPDJQDMJADTQAWTMXTMTDWTMPWPDTGPHIJTJAMWPWNJMDAGDGATDMJPAKTKMDGMJADMHJL"
            )
    }
}