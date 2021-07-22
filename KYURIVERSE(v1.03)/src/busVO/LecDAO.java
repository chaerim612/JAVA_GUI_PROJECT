package busVO;

import java.util.ArrayList;

public class LecDAO {
	private static ArrayList<Lecture> Leclist;
	
	public LecDAO() {
		if(Leclist==null) {
			init();
		}
	}

	private void init() {
		Leclist = new ArrayList<Lecture>();
		//(String LecName,String eng,String minPro,String license,String codingTest,String degree)
		//(회사명, 외국어능력, 제공 강의, 자격증 강의, 코딩테스트 강의,학위 가이드)
		Leclist.add(new Lecture("네이버","영어 회화 온라인 강의 제공","리눅스 서버 개발 강의 제공, JAVA 프로그래밍 강의 제공","정보처리기사 기출 문제 제공 및 풀이 강의 제공", "알고리즘 강의 제공","학사 취득 가이드 제공"));
		Leclist.add(new Lecture("카카오","영어 회화 온라인 강의 제공","Java 프로그래밍 강의 제공, Python을 활용한 머신러닝 강의 제공","정보처리기사 기출 문제 제공 및 풀이 강의 제공", "알고리즘 강의 제공","학사 취득 가이드 제공"));
		Leclist.add(new Lecture("마이크로소프트","영어 회화 온라인 강의 제공","프로젝트 N회 참여를 통한 문제 해결 능력 향상 강의 제공","운전면허 필기 시험 1회 지원", "알고리즘 강의 제공","학사 취득 가이드 제공"));
		Leclist.add(new Lecture("애플","토익 온라인 강의 제공","JAVA와 XML을 활용한 안드로이드 프로젝트 개발 강의 제공","", "정보처리기사 기출 문제 제공 및 풀이 강의 제공","학사 취득 가이드 제공"));
		Leclist.add(new Lecture("IBM","영어 회화 온라인 강의 제공","Python을 활용한 머신러닝/딥러닝 기반 모델 설계 및 구현","정보처리기사 기출 문제 제공 및 풀이 강의 제공", "알고리즘 강의 제공","학사 취득 가이드 제공"));
		Leclist.add(new Lecture("구글","영화 회화 온라인 강의 제공","소규모 프로젝트 진행","정보처리기사 기출 문제 제공 및 풀이 강의 제공", "코딩테스트 대비 강의 제공","학사 취득 가이드 제공"));
	}
	
	
	//회사 이름 검색해서 해당 회사 취업 코스 뽑아냄
	public static Lecture searchLec(String name) {
		for (int i = 0; i < Leclist.size(); i++) {
			if (Leclist.get(i).getLecName().equals(name)) {
				return Leclist.get(i);
			}
		}
		return null;
	}
	
}
