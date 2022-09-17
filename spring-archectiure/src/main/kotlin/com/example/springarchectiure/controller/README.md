# Controller Layer

API 의 기본 요청들을 처리하는 부분입니다.

들어오는 요청값과 응답값의 정의가 중요합니다.

{XXX}RequestDto, {XXX}ResponseDto 가 있을수 있습니다.

각 Dto는 fun toServiceDto로 변환할수 있어야합니다.

- toServiceDto는 서비스에서 이용되는 DTO, 또는 DTO들로 변환하는 함수입니다.
- RequestDto, ResponseDto 는 모두 ServiceDto로 변환가능해야 합니다.

