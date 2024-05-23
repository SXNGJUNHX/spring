<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://pinnpublic.dothome.co.kr/cdn/example-min.css">
</head>
<body>
	<!-- test.jsp -->
	<h1>WebSocket <small>기본 사용법</small></h1>
	
	<div>
		<button type="button" class="in" id="btn-connect">연결하기</button>
		<button type="button" class="out" id="btn-disconnect">종료하기</button>
	</div>
	
	<hr>
	
		<div>
			<input type="text" class="long" id="msg">
			<button type="button" id="btn-echo">에코 테스트</button>
		</div>
	
	<hr>
	
	<div class="message full"></div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script>
	
		//서버측 주소
		//const url = 'ws://echo.websocket.org';
		const url = 'ws://localhost:8080/websocket/server.do';
		//const url = 'ws://192.168.10.43:8090/websocket/server.do';
		
		
		
		//웹소켓
		let ws;
		
	
		$('#btn-connect').click(() => {
			
			//1. 소켓 생성
			//2. 서버 접속(연결)
			//3. 통신
			//4. 서버 접속 해제
			
			//1. 소켓생성 + 2. 서버 접속(연결)
			ws = new WebSocket(url);
			
			//소켓 이벤트 > 콜백
			//서버측에서 소켓 연결을 받아들이고 서로 연결이 되는 순간 발생
			ws.onopen = evt => {
				log('서버와 연결되었습니다.');
			};
			
			//상대방이 나에게 메시지를 전달 > 내가 수신하는 순간 발생
			ws.onmessage = evt => {
				log('서버로부터 응답받은 데이터: ' + evt.data);	
			};
			
			ws.onerror = evt => {
				log('에러가 발생했습니다.');	
			};
			
		});
		
		
		
		$('#btn-disconnect').click(() => {
			ws.close();
			log('연결을 종료합니다.');
		});
		
		
		$('#btn-echo').click(() => {
			//현재 연결되어 있는 서버측에게 데이터 전송하기
			//ws.send('안녕하세요.');
			ws.send($('#msg').val());
			log('메시지를 전송했습니다.');
		});
		
	
		function log(msg) {
			$('.message.full').prepend(`<div>[\${new Date().toLocaleTimeString()}] \${msg}</div>`);
		}

		
	</script>
</body>
</html>



















