data "aws_region" "current" {}

resource "aws_security_group" "allow_http" {
  name        = "${var.namespace}-allow_http"
  description = "Libera porta 80 para todos os IPs"
  vpc_id      = var.my_vpc_id

  ingress {
    description      = "TLS from VPC"
    from_port        = 80
    to_port          = 80
    protocol         = "tcp"
    cidr_blocks      = ["0.0.0.0/0"]
  }

  egress {
    from_port        = 0
    to_port          = 0
    protocol         = "-1"
    cidr_blocks      = ["0.0.0.0/0"]
  }

  tags = {
    Name = "${var.namespace}-allow_http"
  }
}

resource "aws_security_group" "allow_https" {
  name        = "${var.namespace}-allow_https"
  description = "Libera porta 443 para todos os IPs"
  vpc_id      = "${var.my_vpc_id}"

  ingress {
    description      = "TLS from VPC"
    from_port        = 443
    to_port          = 443
    protocol         = "tcp"
    cidr_blocks      = ["0.0.0.0/0"]
  }

  egress {
    from_port        = 0
    to_port          = 0
    protocol         = "-1"
    cidr_blocks      = ["0.0.0.0/0"]
    ipv6_cidr_blocks = ["::/0"]
  }

  tags = {
    Name = "${var.namespace}-allow_https"
  }
}