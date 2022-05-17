$(function () {
    $(".entrada1").mask("00:00", {
      placeholder: "--:--",

      onChange: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaEntrada1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_inicio").attr("readonly", true).val("");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (validaHora(horaC)) {
              $("#almoco_inicio").attr("readonly", false);
              $("#validaEntrada1")
                .addClass("d-none")
                .removeClass("d-block");
              $("#almoco_inicio").focus();
            } else {
              currentField.val("");
              $("#validaEntrada1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaSaida1").addClass("d-none").removeClass("d-block");
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            }
            break;
          default:
            $("#validaEntrada1").addClass("d-none").removeClass("d-block");
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_inicio").attr("readonly", true).val("");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },

      onComplete: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaEntrada1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_inicio").attr("readonly", true).val("");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (validaHora(horaC)) {
              $("#almoco_inicio").attr("readonly", false);
              $("#validaEntrada1")
                .addClass("d-none")
                .removeClass("d-block");
              $("#almoco_inicio").focus();
            } else {
              currentField.val("");
              $("#validaEntrada1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaSaida1").addClass("d-none").removeClass("d-block");
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            }
            break;
          default:
            $("#validaEntrada1").addClass("d-none").removeClass("d-block");
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_inicio").attr("readonly", true).val("");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },
    });

    $(".saida1").mask("00:00", {
      placeholder: "--:--",

      onChange: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaSaida1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              verificaHorario($("#entrada1").val(), horaC)
            ) {
              $("#validaSaida1").addClass("d-none").removeClass("d-block");
              $("#almoco_fim").attr("readonly", false);
              $("#almoco_fim").focus();
            } else {
              currentField.val("");
              $("#validaSaida1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            }
            break;
          default:
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },

      onComplete: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaSaida1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              verificaHorario($("#entrada1").val(), horaC)
            ) {
              $("#validaSaida1").addClass("d-none").removeClass("d-block");
              $("#almoco_fim").attr("readonly", false);
              $("#almoco_fim").focus();
            } else {
              currentField.val("");
              $("#validaSaida1").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            }
            break;
          default:
            $("#validaSaida1").addClass("d-none").removeClass("d-block");
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#almoco_fim").attr("readonly", true).val("");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },
    });

    $(".entrada2").mask("00:00", {
      placeholder: "--:--",

      onChange: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaEntrada2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              horaC !== $(".saida1").val() &&
              verificaHorario($("#almoco_inicio").val(), horaC)
            ) {
              $("#saida").attr("readonly", false);
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#saida").focus();
            } else {
              currentField.val("");
              $("#validaEntrada2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
              $("#saida").attr("readonly", true).val("");
            }
            break;
          default:
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },

      onComplete: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaEntrada2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#saida").attr("readonly", true).val("");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              horaC !== $(".saida1").val() &&
              verificaHorario($("#almoco_inicio").val(), horaC)
            ) {
              $("#saida").attr("readonly", false);
              $("#validaEntrada2").addClass("d-none").removeClass("d-block");
              $("#saida").focus();
            } else {
              currentField.val("");
              $("#validaEntrada2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
              $("#saida").attr("readonly", true).val("");
            }
            break;
          default:
            $("#validaEntrada2").addClass("d-none").removeClass("d-block");
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            $("#saida").attr("readonly", true).val("");
            break;
        }
      },
    });

    $(".saida2").mask("00:00", {
      placeholder: "--:--",

      onChange: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaSaida2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              horaC !== $(".entrada2").val() &&
              verificaHorario($(".entrada2").val(), horaC)
            ) {
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            } else {
              currentField.val("");
              $("#validaSaida2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            }
            break;
          default:
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            break;
        }
      },

      onComplete: function (horaC, event, currentField, options) {
        switch (horaC.length) {
          case 0:
            $("#validaSaida2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            break;
          case 5:
            if (
              validaHora(horaC) &&
              horaC !== $(".entrada2").val() &&
              verificaHorario($(".entrada2").val(), horaC)
            ) {
              $("#validaSaida2").addClass("d-none").removeClass("d-block");
            } else {
              currentField.val("");
              $("#validaSaida2").addClass("d-block").removeClass("d-none").text("Hora Inválida!");
            }
            break;
          default:
            $("#validaSaida2").addClass("d-none").removeClass("d-block");
            break;
        }
      },
    });
  });

  function validaHora(stringHora) {
    let hora = parseInt(stringHora.substring(0, 2));
    let min = parseInt(stringHora.substring(3));
    let totalEmMinutos = hora * 60 + min;
    return (
      hora >= 0 &&
      hora <= 23 &&
      min >= 0 &&
      min < 60 &&
      totalEmMinutos !== 0 &&
      /^([0-1][0-9]|2[0-3]):([0-5][0-9])$/.test(stringHora)
    );
  }

  function verificaHorario(horaAnterior, horaAtual) {
    let horaAnt = parseInt(horaAnterior.substring(0, 2));
    let minAnt = parseInt(horaAnterior.substring(3));
    let totalEmMinutosAnt = horaAnt * 60 + minAnt;

    let horaAtu = parseInt(horaAtual.substring(0, 2));
    let minAtu = parseInt(horaAtual.substring(3));
    let totalEmMinutosAtu = horaAtu * 60 + minAtu;

    return totalEmMinutosAnt < totalEmMinutosAtu;
  }