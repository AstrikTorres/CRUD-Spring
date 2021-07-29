package generation.mx.controllers;

import generation.mx.models.PostModel;
import generation.mx.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public ArrayList<PostModel> getPosts() {
        return postService.getPosts();
    }

    @PostMapping
    public PostModel savePost(@RequestBody PostModel post) {
        return postService.savePost(post);
    }

    @GetMapping(path = "/{id}")
    public Optional<PostModel> getPostById(@PathVariable("id") Long id) {
        return postService.getPostById(id);
    }

    @GetMapping("/query")
    public ArrayList<PostModel> getPostsByTitle
            (@RequestParam(value = "title", defaultValue = "") String title) {
        return postService.getPostsByTitle(title);
    }

    @GetMapping("/q")
        public ArrayList<PostModel> getBytitleOrderById
            (@RequestParam(value = "title", defaultValue = "") String title) {
        return postService.getByTitleContainingOrderByIdDesc(title);
    }

}
