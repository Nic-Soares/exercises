larg = float(input('Largura da parede: '))
alt = float(input('Altura da parede: '))
area = larg * alt
print('Sua parede possui a dimensao de {}x{}  e sua area é de {}m².'.format(larg, alt, area))
tinta = area / 2
print('Para pintar sua parede sera preciso {:.2f}L de tinta'.format(tinta
                                                                    ))