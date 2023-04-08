package net.chimaek.myhomepage.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumeRepository : MongoRepository<Resume, Long> {
}