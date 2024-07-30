describe("cadastro_carro", function () {
    it("cadastro", function () {
    cy.viewport(1866, 954);
    cy.visit("https://cadastrocars.vercel.app/");
    
      // Acessar o formulário de cadastro
    cy.get('.button').contains('Cadastrar').click()
    
      // Selecionar marca do carro
    cy.get('.brandField').select('toyota')
    
      // Preencher campo de modelo
    cy.get('.modelField').type('Etios')
    
      // Preencher ano do carro
    cy.get('.yearField').type('2011')
    
      // Preencher quilometragem
    cy.get(".kmField").type("200000");
    
      // Preencher preço
    cy.get(".priceField").type("80000");
    
      // Enviar o formulário
    cy.get(".pageSplit > .pageLeft > .button").click();
    });
});
