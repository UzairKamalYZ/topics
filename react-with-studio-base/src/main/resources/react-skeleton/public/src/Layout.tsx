import styled from "styled-components";

const Main = styled.main`
  display: flex;
  justify-content: center;
  align-items: center;
`;

const Container = styled.div`
  max-width: 1300px;
  width: 50%;
`;

function Layout({ children }) {
  return (
    <Main>
      <Container>{children}</Container>
    </Main>
  );
}

export default Layout;
