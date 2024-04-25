package com.fastcampus.fcboard.controller

import com.fastcampus.fcboard.controller.dto.PostCreateRequest
import com.fastcampus.fcboard.controller.dto.PostUpdateRequest
import org.springframework.data.annotation.CreatedBy
import org.springframework.web.bind.annotation.*

@RestController
class PostController {
    @PostMapping("/posts")
    fun createPost(
        @RequestBody postCreateRequest: PostCreateRequest
    ): Long{
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePost(
        @PathVariable id: Long,
        @RequestBody createdBy: String
    ): Long {
        println(createdBy)
        return 1L
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(
        @PathVariable id: Long,
        @RequestParam createdBy: String
    ): Long{
        println(createdBy)
        return id
    }

}
