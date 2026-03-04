package com.semih.taskapi.repository;

import com.semih.taskapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

/* Notes (Remove later!!!)

" ... extends JpaRepository<Task, Long> " generates:

- Runtime implementation of this interface (no manual class needed)
- Basic CRUD operations: save(), findById(), findAll(), deleteById(), delete(), existsById()
- Pagination and sorting support
- SQL generation based on the Task entity
- Transaction handling for standard operations

Additional query methods can be defined by method name (e.g. findByTitle(String title)) and Spring
will automatically generate the corresponding query

No implementation code required - Spring handles it, using dynamic proxies and the EntityManager internally


 */
