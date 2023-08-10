package dk.cs.domaindb.controller;

import dk.cs.domaindb.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delete")
public class DeleteController {
    DomainService domainService;

    @Autowired
    public DeleteController(DomainService domainService) {
        this.domainService = domainService;
    }

    @DeleteMapping("{url}")
    public ResponseEntity<Object> delete(@PathVariable String url) {
        domainService.delete(url);
        return ResponseEntity.noContent().build();
    }
}
