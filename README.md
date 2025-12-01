TeX로 조판한 문서를 모아놓은 리포지토리입니다.

## [preamble.tex](https://github.com/tonextpage/TeX-Documents/blob/28f796ced48c096816a3fce742c2fe40d53a6ab9/preamble.tex) 이용 가이드

### 폰트 설치하기
preaamble.tex에 설정된 기본 폰트는 [**KoPub Dotum**](https://www.kopus.org/biz-electronic-font2/)입니다. 해당 폰트를 다운로드하시거나, 다음 부분을 수정하여 원하는 폰트를 사용하시기 바랍니다.

https://github.com/tonextpage/TeX-Documents/blob/28f796ced48c096816a3fce742c2fe40d53a6ab9/preamble.tex#L28-L33

---

### preamble에 정의된 tcolorbox

preamble.tex에는 문서 조판에 도움되는 여러 tcolorbox 환경이 정의되어 있습니다.

[tcolorbox 패키지](https://ctan.org/pkg/tcolorbox)를 이용하여 새로운 상자를 디자인하여 사용할 수 있습니다.

문서 샘플 [sample.tex](https://github.com/tonextpage/TeX-Documents/blob/43b46be03d7181becaad294163a61198c1aff1f8/sameple/sample.pdf)을 확인해보세요.

| 환경 이름 | 사용법 요약|
| ------------- | ------------- |
| 정의 | \begin{dfn}{제목}{참조 키워드}  |
| 예시 | \begin{example}{제목}{참조 키워드} |
| 예제 | \begin{exc}{제목}{참조 키워드} |
| 정리 | \begin{thm}{제목}{참조 키워드} |
| 보조정리 | \begin{lemma}{제목}{참조 키워드} |
| 명제 | \begin{prop}{제목}{참조 키워드} |
| 증명 | \begin{proof} |
| 참고 | \begin{remark}[제목] |
| 연습문제 | \begin{prob}{제목}{참조 키워드} |
| 풀이 | \begin{sol}[제목] |
| 힌트 | \begin{hint}[제목] |

**정의(definition)**

```TeX
\begin{dfn}{제목}{참조 키워드}
  내용
\end{dfn}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L11-L18

**예시(example)와 예제(example problem)**

```TeX
% 예시
\begin{example}{제목}{참조 키워드}
  내용
\end{example}

% 예제
\begin{exc}{제목}{참조 키워드}
  내용
\end{exc}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L21-L27

**정리(theorem)**

```TeX
% 정리
\begin{thm}{제목}{참조 키워드}
  내용
\end{thm}

% 보조정리
\begin{lemma}{제목}{참조 키워드}
  내용
\end{lemma}

% 명제
\begin{prop}{제목}{참조 키워드}
  내용
\end{prop}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L29-L36

**증명(proof)**

```TeX
\begin{proof}
  내용
\end{proof}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L38-L53

**참고(remark)**

```TeX
\begin{remark}[제목(기본값="참고")]
  내용
\end{remark}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L55-L57

**연습문제(exercise)**

```TeX
\begin{prob}{제목}{참조 키워드}
  내용
\end{prob}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L59-L65

**풀이(solution)**

```TeX
\begin{sol}[제목(기본값="")]
  내용
\end{sol}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L67-L77

**힌트 상자(hint box)**

```TeX
\begin{hint}[제목(기본값="")]
  내용
\end{hint}
```

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L81-L84

https://github.com/tonextpage/TeX-Documents/blob/c37cb882f848aa819b3e49a2c77dda57ec8af7e0/sameple/sample.tex#L86-L93
