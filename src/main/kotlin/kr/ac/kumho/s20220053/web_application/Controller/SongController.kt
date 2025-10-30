package kr.ac.kumho.s20220053.web_application.Controller

import kr.ac.kumho.s20220053.web_application.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(
    private val service: SongService
) {
    //val title = listOf("Golder", "Blue Valentine", "타임캡슐")

    @GetMapping("/songs")
    fun getSongList() = service.getAllSongs()
}