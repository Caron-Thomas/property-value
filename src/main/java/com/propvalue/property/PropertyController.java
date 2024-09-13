package com.propvalue.property;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    private final PropertyRepository propertyRepository;

    public PropertyController(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @GetMapping("")
    public List<Property> getProperties() {
        return propertyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable Long id) {
        Optional<Property> property = propertyRepository.findById(id);

        if(property.isEmpty()) {
            throw new PropertyNotFoundException();
        }
        return property.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createProperty(@Valid @RequestBody Property property) {
        propertyRepository.create(property);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Property property, @PathVariable Long id) {
        propertyRepository.update(property, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        propertyRepository.delete(id);
    }
}
