package ch08.exercise.p7;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("오라클 디비에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("오라클 디비에 삽입");
    }

    @Override
    public void update() {
        System.out.println("오라클 디비를 수정");
    }

    @Override
    public void delete() {
        System.out.println("오라클 디비에서 삭제");
    }
}
