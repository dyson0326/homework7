package com.homework7.eevees;

import com.homework7.eevees.Request.NameCreateRequest;
import com.homework7.eevees.Request.NameDeleteRequest;
import com.homework7.eevees.Request.NameUpdateRequest;
import com.homework7.eevees.Response.NameCreateResponse;
import com.homework7.eevees.Response.NameDeleteResponse;
import com.homework7.eevees.Response.NameResponse;
import com.homework7.eevees.Response.NameUpdateResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
@RestController
public class EeveesController {

    @GetMapping("/eevees")
    public List<NameResponse> getNames(){
        List<NameResponse> eevees = List.of(
                new NameResponse("イーブイ"),
                new NameResponse("シャワーズ"),
                new NameResponse("サンダース"),
                new NameResponse("ブースター"));
        return eevees;
    }
    @PostMapping("/eevees")
    public ResponseEntity<NameCreateResponse> createName(@Valid @RequestBody NameCreateRequest nameCreateRequest, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/names/{id}").buildAndExpand(2).toUri();
        return ResponseEntity.created(uri).body(new NameCreateResponse(nameCreateRequest.getWaterEevee()+"と"+nameCreateRequest.getThunderEevee()+"と"+nameCreateRequest.getFlameEevee()+"をゲットした！"));

    }

    @PatchMapping("/eevees/{id}")
    public NameUpdateResponse updateName(@PathVariable int id, @RequestBody NameUpdateRequest nameUpdateResponse){
        return new NameUpdateResponse(nameUpdateResponse.getFlameEevee()+"に進化した！");
    }
    @DeleteMapping("/eevees/{id}")
    public NameDeleteResponse updateName(@PathVariable int id, @RequestBody NameDeleteRequest nameDeleteRequest) {
        return new NameDeleteResponse(nameDeleteRequest.getWaterEevee()+"と"+nameDeleteRequest.getThunderEevee()+"と"+nameDeleteRequest.getFlameEevee()+"を逃がした");
    }
}
