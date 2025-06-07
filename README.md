🛠️ Padrão de Projeto Observer
📌 Visão Geral

O Padrão Observer é um padrão de design comportamental que permite a notificação automática de mudanças em um objeto para múltiplos observadores. Esse padrão é muito útil quando é necessário manter vários elementos sincronizados sem criar dependências rígidas entre eles.

🎯 Objetivo

O principal propósito do Observer é permitir que múltiplos objetos reajam a eventos sem depender diretamente do código principal. Isso torna a aplicação mais modular, flexível e fácil de escalar.

🔎 Como Funciona?

O padrão é baseado em dois papéis principais:

1️⃣ Sujeito (Subject) – O objeto que contém o estado e notifica os observadores sobre mudanças. 2️⃣ Observador (Observer) – Classes que "ouvem" o sujeito e reagem automaticamente quando há alterações.

🚀 Fluxo de Funcionamento:

Os observadores se registram no sujeito.

Quando o sujeito sofre alguma alteração, ele notifica todos os observadores.

Cada observador executa uma ação baseada na mudança.
