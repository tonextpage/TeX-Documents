# tonextpage의 LaTeX 문서 모음

## preamble의 tcolorbox 환경 이용하기
### 정의
**사용법**
```TeX
\begin{dfn}{제목}{참조 키워드}
  내용
\end{dfn}
```
**예시**
```TeX
\section{위상공간의 정의}
\begin{dfn}{위상공간}{1.1}
  집합 $X$의 부분집합들의 모임 ${\mathcal T}\subset{\mathcal P}(X)$가 다음 조건을 만족할 때, $\mathcal T$를 $X$의 \textbf{위상(topology)}라 하고 $(X,{\mathcal T})$를 \textbf{위상 공간}이라 한다.
  \begin{enumerate}[(1)]
    \item $\varnothing,X\in\mathcal T$
    \item 임의의 집합족 $\{U_\alpha\}\subset\mathcal T$에 대하여 $\bigcup_\alpha U_\alpha\in\mathcal T$이다.
    \item 임의의 유한 집합족 $\{U_i\}_{i=1}^n\subset\mathcal T$에 대하여 $\bigcap_{i=1}^nU_i\in\mathcal T$이다.
  \end{enumerate}
\end{dfn}
정의 \ref{dfn:1.1}에서 $\mathcal T$의 원소를 \textbf{열린집합(open set)}이라 한다.
```
