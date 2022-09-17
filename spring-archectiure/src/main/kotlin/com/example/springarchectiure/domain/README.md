# Business Layer

한개 또는 여러개의 Repository를 활용해 비즈니스 레이어를 구축할수 있습니다.

사용자의 행동으로 인해 생기는 서비스입니다.

ex) 코치를 등록하는 서비스 (행동)
```kotlin

@Service
class RegisterCoachToAcademyService @Autowired constructor (
    val userRepository: UserRepository,
    val academyRepository: AcademyRepository,
) {
    
    @Transactional
    fun registerCoach(coach: UserDto.Coach, academy: Academy) {
        val coach = userDataSource.find(coachId).toDTO()
        val academy = academyDataSoruce.find(academyId).toDTO()
        
        if (coach is UserDto.Coach) {
            val coaches = academy.coaches + coach
            val academy = academyRepository.save(academy.copy(coaches = coaches).toEntity()).toDTO()
            return acacdemy
        }
        
        throw NotCoach
    }
    
    @Transactional
    fun registerCoaches(coachIds: Collection<String>, academyId: String) {
        val coaches = userRepository.findAll(coachIds).map { it.toDTO() }.filter { it.auth == AuthType.COACH }
        var academy = academyRepository.find(academyId).toDTO()
        
        academy = academyRepository.save(academy.copy(coaches = coaches).toDTO())
        
        return academy
    }
}
```

