package boot.data.inter;

import java.util.List;

import boot.data.dto.Board_ContentDto;

public interface BoardAnswerServiceInter {

	public int getMaxNum();
	public int getTotalCount();
	public void insertBanswer(Board_ContentDto dto);
	public List<Board_ContentDto> getAllBAnswer(String board_num);
	public Board_ContentDto getAnswer(String board_num); //댓글수정num
	public void updateBanswer(Board_ContentDto dto); //댓글 수정
}
