package kr.ac.kumho.s20220053.web_application.service

import kr.ac.kumho.s20220053.web_application.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song> {
        return listOf(
            Song(1, "Golden", "HUNTR/X")
        )
    }
}