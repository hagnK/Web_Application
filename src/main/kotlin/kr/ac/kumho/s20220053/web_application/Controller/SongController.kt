package kr.ac.kumho.s20220053.web_application.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class SongController {
    val title = listOf("Golder", "Blue", "surf")

    @GetMapping("/songs")
    fun getSongList() = title

}