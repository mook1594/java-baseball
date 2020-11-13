# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
- 랜덤으로 1~9 까지 3개의 수를 생성
- 세개의 숫자를 입력받음
- 생성된 숫자와 입력받는 숫자가 존재하면 볼, 존재하면서 자리가 같으면 스트라이크 아무것도 일치하지 않으면 낫싱으로 판단
- 게임을 계속할지 여부를 물어 게임 진행

## 기능 목록
- 숫자 랜덤 생성 (RandomNumberFactory)
- 숫자 입력 (InputScanner)
- 볼카운트 계산 (BallCountChecker)
- 볼카운트 출력 (BallCountPrinter)
- 게임 시작/종료/재시작여부 (BaseBallGame)
