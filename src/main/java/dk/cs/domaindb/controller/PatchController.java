package dk.cs.domaindb.controller;

import dk.cs.domaindb.models.domain.DomainDto;
import dk.cs.domaindb.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("patch")
public class PatchController {
    DomainService domainService;
    @Autowired
    public PatchController(DomainService domainService) {
        this.domainService = domainService;
    }


    @PatchMapping("domain/{url}")
    public ResponseEntity<DomainDto> update(@PathVariable String url,
                                            @RequestBody DomainDto dto){
        return ResponseEntity.noContent().build();
    }




}
