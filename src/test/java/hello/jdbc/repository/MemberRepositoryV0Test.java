package hello.jdbc.repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MemberRepositoryV0Test {

	MemberRepositoryV0 repository = new MemberRepositoryV0();

	// @Test
	// void crud() throws SQLException {
	//     Member member = new Member("memberV700", 10000);
	//     repository.save(member);
	//
	//     //findMember
	//     Member findMember = repository.findById(member.getMemberId());
	//     log.info("findMember={}", findMember);
	//     log.info("member != findMember {}", member == findMember);
	//     assertThat(findMember).isEqualTo(member);
	//
	//     //update: money 10000 -> 20000
	//     repository.update(member.getMemberId(), 20000);
	//     Member updateMember = repository.findById(member.getMemberId());
	//     assertThat(updateMember).isEqualTo(member);
	//
	//     //delete
	//     repository.delete(member.getMemberId());
	//     org.assertj.core.api.Assertions.assertThatThrownBy(() -> member.getMemberId())
	//             .isInstanceOf(NoSuchElementException.class);
	//     Member deleteMember = repository.findById(member.getMemberId());
	//
	// }
}